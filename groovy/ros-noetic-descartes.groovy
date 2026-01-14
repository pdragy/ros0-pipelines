node {
    git url: 'https://github.com/ros-industrial-consortium/descartes.git', branch: 'melodic-devel'
    registerROS('ros:noetic-ros-base', [
        'ros-noetic-eigen-conversions',
        'ros-noetic-moveit-kinematics',
        'ros-noetic-moveit-ros-planning',
        'ros-noetic-tf'
    ], ['ros-noetic-moveit-core'])
}
