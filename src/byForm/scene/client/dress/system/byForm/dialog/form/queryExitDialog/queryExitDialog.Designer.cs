﻿/* 本文件由拜语言 IDE 自动生成，网址:http://www.baiyuyan.com/  生成时间:2024-04-30 02:43:05  */
namespace byForm.dress.form
{
    partial class queryExitDialog
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.textLabel = new System.Windows.Forms.Label();
            this.buttonContainer = new System.Windows.Forms.Panel();
            this.exitButton = new System.Windows.Forms.Button();
            this.cancelButton = new System.Windows.Forms.Button();
            this.buttonContainer.SuspendLayout();
            this.SuspendLayout();
            //
            //  textLabel
            //
            this.textLabel.AutoSize = true;
            this.textLabel.Location = new System.Drawing.Point(4, 4);
            this.textLabel.Name = "textLabel";
            this.textLabel.Size = new System.Drawing.Size(100,30);
            this.textLabel.TabIndex = 0;
            this.textLabel.Text = "退出窗体文本标签";
            //
            //  buttonContainer
            //
            this.buttonContainer.Location = new System.Drawing.Point(112, 4);
            this.buttonContainer.Name =  "buttonContainer";
            this.buttonContainer.Size = new System.Drawing.Size(100, 30);
            this.buttonContainer.TabIndex =  0;
            //
            //  exitButton
            //
            this.exitButton.Location = new System.Drawing.Point(220, 4);
            this.exitButton.Name = "exitButton";
            this.exitButton.Size = new System.Drawing.Size(100, 30);
            this.exitButton.TabIndex = 0;
            this.exitButton.Text = "退出窗体退出键";
            this.exitButton.UseVisualStyleBackColor = true; 
            //
            //  cancelButton
            //
            this.cancelButton.Location = new System.Drawing.Point(328, 4);
            this.cancelButton.Name = "cancelButton";
            this.cancelButton.Size = new System.Drawing.Size(100, 30);
            this.cancelButton.TabIndex = 0;
            this.cancelButton.Text = "退出窗体取消键";
            this.cancelButton.UseVisualStyleBackColor = true; 
            //
            //  queryExitDialog
            //
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(900, 600);
            this.Controls.Add(this.cancelButton);
            this.Controls.Add(this.exitButton);
            this.Controls.Add(this.buttonContainer);
            this.Controls.Add(this.textLabel);
            this.Name = "queryExitDialog";
            this.Text = "询问是否退出的弹窗";
            this.ResumeLayout(false);
            this.PerformLayout();
            this.buttonContainer.ResumeLayout(false);
            this.buttonContainer.PerformLayout();


        }
        
        #endregion

        private System.Windows.Forms.Label textLabel;
        private System.Windows.Forms.Panel buttonContainer;
        private System.Windows.Forms.Button exitButton;
        private System.Windows.Forms.Button cancelButton;

        
    }
}